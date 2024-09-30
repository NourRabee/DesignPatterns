public interface IDish {

    void serve();
}

interface IDessert extends IDish{
}

interface IMainCourse extends IDish{
}

interface IAppetizer extends IDish {
}

