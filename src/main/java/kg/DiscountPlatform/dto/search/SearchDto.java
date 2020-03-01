package kg.DiscountPlatform.dto.search;

import kg.DiscountPlatform.entity.*;

import java.util.LinkedList;
import java.util.List;

public class SearchDto {
    private MainCategories mainCategoriesList;
    private Categories categoriesList;
    private NetworkCategories networkCategoriesList;
    private SubCategories subCategoriesList;
    private Products productsList;

    public SearchDto(MainCategories mainCategoriesList, Categories categoriesList, NetworkCategories networkCategoriesList, SubCategories subCategoriesList, Products productsList) {
        this.mainCategoriesList = mainCategoriesList;
        this.categoriesList = categoriesList;
        this.networkCategoriesList = networkCategoriesList;
        this.subCategoriesList = subCategoriesList;
        this.productsList = productsList;
    }

    public static List<SearchDto> toList(List<MainCategories> mainCategoriesList, List<Categories> categoriesList, List<NetworkCategories> networkCategoriesList, List<SubCategories> subCategoriesList, List<Products> productsList) {
        List<SearchDto> result = new LinkedList<>();
        for (MainCategories mainCategories : mainCategoriesList) {
            for (Categories categories : categoriesList) {
                for (NetworkCategories networkCategories : networkCategoriesList) {
                    for (SubCategories subCategories : subCategoriesList) {
                        for (Products products : productsList) {
                            result.add(new SearchDto(mainCategories, categories, networkCategories, subCategories, products));
                        }
                    }
                }
            }
        }
        return result;
    }

    public MainCategories getMainCategoriesList() {
        return mainCategoriesList;
    }

    public Categories getCategoriesList() {
        return categoriesList;
    }

    public NetworkCategories getNetworkCategoriesList() {
        return networkCategoriesList;
    }

    public SubCategories getSubCategoriesList() {
        return subCategoriesList;
    }

    public Products getProductsList() {
        return productsList;
    }
}
