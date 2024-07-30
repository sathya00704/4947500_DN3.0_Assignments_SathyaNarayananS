public class PdfDocument implements Document {

    public PdfDocument() {
        System.out.println("Creating a PDF document");
    }

    @Override
    public void open() {
        System.out.println("Opening PDF document");
    }

    @Override
    public void save() {
        System.out.println("Saving PDF document");
    }

    @Override
    public void close() {
        System.out.println("Closing PDF document");
    }
}
