import java.time.LocalDate;
import java.util.List;
import java.util.concurrent.SubmissionPublisher;
import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Subscription;

class NotaFiscal {

    public NotaFiscal(String string, double d, LocalDate now) {
    }
}

class NotaFiscalSubscriber implements Subscriber<NotaFiscal> {

    @Override
    public void onSubscribe(Subscription subscription) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void onNext(NotaFiscal item) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void onError(Throwable throwable) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void onComplete() {
        // TODO Auto-generated method stub
        
    }
}

public class java9 {

    public static void main(String[] args) {

        // Factory method para coleções
        List<String> nomes = List.of("Pedro", "Thais");
        System.out.println(nomes);

        // Fluxo Reativo
        NotaFiscalSubscriber nfs = new NotaFiscalSubscriber();
        SubmissionPublisher<NotaFiscal> publisher = new SubmissionPublisher<NotaFiscal>();
        publisher.subscribe(nfs);
        NotaFiscal notaFiscal = new NotaFiscal("João", 39.99, LocalDate.now());
        publisher.submit(notaFiscal);
        publisher.close();

        // Java Modular
        // module br.com.pfreitas {
            // requires br.alura.pfreitas.nf;
            // requires br.com.alura.http;
        // }
    }

}
