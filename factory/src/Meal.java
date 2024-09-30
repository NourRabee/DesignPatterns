class Meal {
    private IAppetizer appetizer;
    private IMainCourse mainCourse;
    private IDessert dessert;

    public IAppetizer getAppetizer() {
        return appetizer;
    }

    public void setAppetizer(IAppetizer appetizer) {
        this.appetizer = appetizer;
    }

    public IMainCourse getMainCourse() {
        return mainCourse;
    }

    public void setMainCourse(IMainCourse mainCourse) {
        this.mainCourse = mainCourse;
    }

    public IDessert getDessert() {
        return dessert;
    }

    public void setDessert(IDessert dessert) {
        this.dessert = dessert;
    }
}