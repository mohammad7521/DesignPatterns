package structural.decorator;

import structural.decorator.external.Datasource;

public class Main {
    public static void main(String[] args) {
        var dataSource = new Datasource(); // outside code.

        // datasource wrapper.
        CompressionDecorator compressionWithEncryptionDecorator =
                new CompressionDecorator(
                        new EncryptionDecorator(
                                new DatasourceDecorator(dataSource)
                        )
                );

        var compressionOnly =
                new CompressionDecorator(
                        new DatasourceDecorator(dataSource)
                );

        var encryptionOnly =
                new EncryptionDecorator(
                        new DatasourceDecorator(dataSource)
                );

        compressionWithEncryptionDecorator.write("SSSSS");
        //var String = compressionDecorator.read();

    }
}
