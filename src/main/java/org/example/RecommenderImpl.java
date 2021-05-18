package org.example;

@Singleton
public class RecommenderImpl implements Recommender {

    @InjectProperty("wisky")
    private String alcohol;

    public RecommenderImpl() {
        System.out.println("recommendator was created");
    }

    @Override
    public void recommend() {
        System.out.println("to protect from covid-2019, drink " + alcohol);
    }
}
