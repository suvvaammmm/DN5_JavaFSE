package DeepSkilling.SpringCore_Maven.Exercise2_DependencyInjection;

public class BookService {

    private BookRepository repository;

    // Setter Injection
    public void setRepository(BookRepository repository) {
        this.repository = repository;
    }

    public void displayService() {

        System.out.println("Book Service Object Created");

        repository.displayRepository();

    }

}