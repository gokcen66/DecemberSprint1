package pageModels;

public enum NavMenu {

    /**
     * Navigation menu links chain. First value is Header of the required page
     * enum has 2 variables, header: String and links: String varargs
     */

    Dashboard ("Dashboard", "Dashboard"),
    Citizenships ("Citizenships", "Setup", "Parameters", "Citizenships"),
    Nationalities ("Nationalities", "Setup", "Parameters", "Nationalities"),
    Fees ("Fee Types", "Setup", "Parameters","Fees"),
    Discounts ("Discounts", "Setup", "Parameters", "Discounts"),
    GradeLevels ("Grade Levels", "Setup", "Parameters", "Grade Levels"),
    DocumentTypes ("Document Types", "Setup", "Parameters", "Document Types"),
    Notifications ("Notifications", "Messaging", "Notifications"),
    ItemCategories ("Item Categories", "Inventory", "Setup", "Item Categories"),
    BudgetProjects ("Budget Projects", "Budget", "Setup", "Budget Projects")
    ;

    private String header;
    private String[] links;

    NavMenu(String header, String...links) {
        this.header = header;
        this.links = links;
    }

    public String getHeader(){
        return header;
    }
    public String[] getLinks(){
        return links;
    }

}
