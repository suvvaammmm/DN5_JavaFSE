CREATE TABLE Customers (
    CustomerID NUMBER PRIMARY KEY,
    Name VARCHAR2(100),
    DOB DATE,
    Balance NUMBER(12,2),
    LastModified DATE
);
CREATE TABLE Accounts (
    AccountID NUMBER PRIMARY KEY,
    CustomerID NUMBER,
    AccountType VARCHAR2(20),
    Balance NUMBER(12,2),
    LastModified DATE,
    CONSTRAINT FK_Accounts_Customers
        FOREIGN KEY (CustomerID)
        REFERENCES Customers(CustomerID)
);

CREATE TABLE Transactions (
    TransactionID NUMBER PRIMARY KEY,
    AccountID NUMBER,
    TransactionDate DATE,
    Amount NUMBER(12,2),
    TransactionType VARCHAR2(20),
    CONSTRAINT FK_Transactions_Accounts
        FOREIGN KEY (AccountID)
        REFERENCES Accounts(AccountID)
);

CREATE TABLE Loans (
    LoanID NUMBER PRIMARY KEY,
    CustomerID NUMBER,
    LoanAmount NUMBER(12,2),
    InterestRate NUMBER(5,2),
    StartDate DATE,
    EndDate DATE,
    CONSTRAINT FK_Loans_Customers
        FOREIGN KEY (CustomerID)
        REFERENCES Customers(CustomerID)
);

CREATE TABLE Employees (
    EmployeeID NUMBER PRIMARY KEY,
    Name VARCHAR2(100),
    Position VARCHAR2(50),
    Salary NUMBER(12,2),
    Department VARCHAR2(50),
    HireDate DATE
);

ALTER TABLE Customers
ADD IsVIP VARCHAR2(5);

INSERT INTO Customers VALUES
(1,'Rajesh Kumar',TO_DATE('1952-03-15','YYYY-MM-DD'),25000,SYSDATE,NULL);

INSERT INTO Customers VALUES
(2,'Priya Sharma',TO_DATE('1992-07-20','YYYY-MM-DD'),8000,SYSDATE,NULL);

INSERT INTO Customers VALUES
(3,'Amit Verma',TO_DATE('1958-11-08','YYYY-MM-DD'),18000,SYSDATE,NULL);

INSERT INTO Customers VALUES
(4,'Neha Singh',TO_DATE('1998-05-18','YYYY-MM-DD'),5000,SYSDATE,NULL);

INSERT INTO Customers VALUES
(5,'Sunita Patel',TO_DATE('1949-01-10','YYYY-MM-DD'),30000,SYSDATE,NULL);

INSERT INTO Accounts VALUES
(101,1,'Savings',25000,SYSDATE);

INSERT INTO Accounts VALUES
(102,2,'Checking',8000,SYSDATE);

INSERT INTO Accounts VALUES
(103,3,'Savings',18000,SYSDATE);

INSERT INTO Accounts VALUES
(104,4,'Savings',5000,SYSDATE);

INSERT INTO Accounts VALUES
(105,5,'Checking',30000,SYSDATE);

INSERT INTO Transactions VALUES
(1001,101,SYSDATE-5,5000,'Deposit');

INSERT INTO Transactions VALUES
(1002,102,SYSDATE-3,1000,'Withdrawal');

INSERT INTO Transactions VALUES
(1003,103,SYSDATE-2,2000,'Deposit');

INSERT INTO Transactions VALUES
(1004,104,SYSDATE-1,500,'Deposit');

INSERT INTO Transactions VALUES
(1005,105,SYSDATE,3000,'Withdrawal');

INSERT INTO Loans VALUES
(201,1,100000,8,SYSDATE-100,SYSDATE+15);

INSERT INTO Loans VALUES
(202,2,80000,9,SYSDATE-80,SYSDATE+120);

INSERT INTO Loans VALUES
(203,3,120000,7,SYSDATE-150,SYSDATE+25);

INSERT INTO Loans VALUES
(204,5,150000,10,SYSDATE-200,SYSDATE+10);

INSERT INTO Employees VALUES
(301,'Ankit Sharma','Manager',80000,'HR',TO_DATE('2015-06-15','YYYY-MM-DD'));

INSERT INTO Employees VALUES
(302,'Riya Gupta','Developer',60000,'IT',TO_DATE('2018-08-20','YYYY-MM-DD'));

INSERT INTO Employees VALUES
(303,'Karan Mehta','Analyst',55000,'Finance',TO_DATE('2020-02-10','YYYY-MM-DD'));
COMMIT;

BEGIN
    FOR cust IN (
        SELECT CustomerID,
               Name,
               FLOOR(MONTHS_BETWEEN(SYSDATE,DOB)/12) AS Age
        FROM Customers
    )
    LOOP

        IF cust.Age > 60 THEN

            UPDATE Loans
            SET InterestRate = InterestRate - 1
            WHERE CustomerID = cust.CustomerID;

            DBMS_OUTPUT.PUT_LINE(
                'Interest discount applied to '||cust.Name
            );

        END IF;

    END LOOP;

    COMMIT;
END;
/

SELECT LoanID,
       CustomerID,
       InterestRate
FROM Loans
ORDER BY LoanID;

BEGIN
    FOR cust IN (
        SELECT CustomerID, Balance
        FROM Customers
    )
    LOOP

        IF cust.Balance > 10000 THEN

            UPDATE Customers
            SET IsVIP = 'TRUE'
            WHERE CustomerID = cust.CustomerID;

        ELSE

            UPDATE Customers
            SET IsVIP = 'FALSE'
            WHERE CustomerID = cust.CustomerID;

        END IF;

    END LOOP;

    COMMIT;
END;
/

SELECT CustomerID,
       Name,
       Balance,
       IsVIP
FROM Customers
ORDER BY CustomerID;

BEGIN
    FOR loan_rec IN (
        SELECT c.Name,
               l.LoanID,
               l.EndDate
        FROM Customers c
        JOIN Loans l
        ON c.CustomerID = l.CustomerID
        WHERE l.EndDate BETWEEN SYSDATE AND SYSDATE + 30
    )
    LOOP
        DBMS_OUTPUT.PUT_LINE(
            'Reminder: Loan ID ' || loan_rec.LoanID ||
            ' for ' || loan_rec.Name ||
            ' is due on ' ||
            TO_CHAR(loan_rec.EndDate, 'DD-MON-YYYY')
        );
    END LOOP;
END;
/
SELECT LoanID,
       CustomerID,
       EndDate
FROM Loans
ORDER BY LoanID;