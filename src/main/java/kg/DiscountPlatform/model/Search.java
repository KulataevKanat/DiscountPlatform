package kg.DiscountPlatform.model;

import kg.DiscountPlatform.entity.*;

import javax.persistence.ElementCollection;
import javax.persistence.FetchType;
import java.util.ArrayList;
import java.util.List;

public class Search {
    @ElementCollection(fetch = FetchType.EAGER)
    private List<MainCategories> mainCategoriesList = new ArrayList<>();

    @ElementCollection(fetch = FetchType.EAGER)
    private List<Categories> categoriesList = new ArrayList<>();

    @ElementCollection(fetch = FetchType.EAGER)
    private List<NetworkCategories> networkCategoriesList = new ArrayList<>();

    @ElementCollection(fetch = FetchType.EAGER)
    private List<SubCategories> subCategoriesList = new ArrayList<>();

    @ElementCollection(fetch = FetchType.EAGER)
    private List<Products> productsList = new ArrayList<>();

    public Search() {
    }

    public List<MainCategories> getMainCategoriesList() {
        return mainCategoriesList;
    }

    public void setMainCategoriesList(List<MainCategories> mainCategoriesList) {
        this.mainCategoriesList = mainCategoriesList;
    }

    public List<Categories> getCategoriesList() {
        return categoriesList;
    }

    public void setCategoriesList(List<Categories> categoriesList) {
        this.categoriesList = categoriesList;
    }

    public List<NetworkCategories> getNetworkCategoriesList() {
        return networkCategoriesList;
    }

    public void setNetworkCategoriesList(List<NetworkCategories> networkCategoriesList) {
        this.networkCategoriesList = networkCategoriesList;
    }

    public List<SubCategories> getSubCategoriesList() {
        return subCategoriesList;
    }

    public void setSubCategoriesList(List<SubCategories> subCategoriesList) {
        this.subCategoriesList = subCategoriesList;
    }

    public List<Products> getProductsList() {
        return productsList;
    }

    public void setProductsList(List<Products> productsList) {
        this.productsList = productsList;
    }
}
