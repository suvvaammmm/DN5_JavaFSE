package DeepSkilling.SpringCore_Maven.Exercise5_SpringIoCContainer;

public class BookService {

    private BookRepository repository;

    // Setter Injection
    public void setRepository(BookRepository repository) {
        this.repository = repository;
    }

    public void displayService() {

        System.out.println("Book Service Bean Created");

        repository.displayRepository();

    }

}