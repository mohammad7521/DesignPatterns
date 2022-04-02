package structural.decorator;


import structural.decorator.external.Datasource;

public class CompressionDecorator extends DatasourceDecorator {


    public CompressionDecorator(Datasource datasource) {
        super(datasource);
    }

    public void write(String data) {
        System.out.println("Compressing data ....");
        var compressedData = compress(data);
        super.write(compressedData);
    }

    public String read() {
        System.out.println("Decompressing data ....");
        var compressedData = super.read();
        return decompress(compressedData);
    }

    private String compress(String data) {
        // Do Some compression
        return data;
    }

    private String decompress(String compressedData) {
        // do some decompressing.
        return compressedData;
    }
}
