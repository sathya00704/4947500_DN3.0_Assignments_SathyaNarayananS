public class FactoryMethodPatternTest {

    public static void main(String[] args) {
        // Create a Word document using WordDocumentFactory
        DocumentFactory wordFactory = new WordDocumentFactory();
        Document wordDocument = wordFactory.createDocument();
        wordDocument.open();
        wordDocument.save();
        wordDocument.close();

        System.out.println();

        // Create a PDF document using PdfDocumentFactory
        DocumentFactory pdfFactory = new PdfDocumentFactory();
        Document pdfDocument = pdfFactory.createDocument();
        pdfDocument.open();
        pdfDocument.save();
        pdfDocument.close();

        System.out.println();

        // Create an Excel document using ExcelDocumentFactory
        DocumentFactory excelFactory = new ExcelDocumentFactory();
        Document excelDocument = excelFactory.createDocument();
        excelDocument.open();
        excelDocument.save();
        excelDocument.close();
    }
}
