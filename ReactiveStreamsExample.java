import java.util.List;
import java.util.concurrent.SubmissionPublisher;

public class ReactiveStreamsExample {

    public static void main(String[] args) {
        SubmissionPublisher<String> publisher = new SubmissionPublisher<>();

        publisher.consume(System.out::println);
        
        List.of("esse", "código", "é", "assíncrono").forEach(publisher::submit);

        publisher.close();
    }

}