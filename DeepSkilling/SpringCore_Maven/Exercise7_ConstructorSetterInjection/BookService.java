package DeepSkilling.SpringCore_Maven.Exercise7_ConstructorSetterInjection;

public class BookService {

    private String libraryName;
    private BookRepository repository;

    // Constructor Injection
    public BookService(String libraryName) {
        this.libraryName = libraryName;
    }

    // Setter Injection
    public void setRepository(BookRepository repository) {
        this.repository = repository;
    }

    public void displayService() {

        System.out.println("Library Name : " + libraryName);
        System.out.println("Book Service Initialized");

        repository.displayRepository();

    }

}