package creational_patterns.factory;

import creational_patterns.Document;
import creational_patterns.NewEmployeeDocument;
import creational_patterns.ProductSupplyDocument;

/**
 * Creation Pattern: Factory
 */
public class DocumentFactory {

    //TODO: проаналізувати можливі документи та їх характеристики, передати характеристики у фабрику, щоб стрворити правильний документ замість documentType
    public Document createDocument(String documentType){
        if (NewEmployeeDocument.class.getSimpleName().equals(documentType)){
            return new NewEmployeeDocument();
        }if(ProductSupplyDocument.class.getSimpleName().equals(documentType)){
            return new ProductSupplyDocument();
        }else{
            throw new IllegalArgumentException("Such document doesn't exist");
        }
    }
}
