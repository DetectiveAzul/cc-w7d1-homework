import interfaces.IEnjoyable;

import java.util.ArrayList;

public class ThemePark {
    private String name;
    private ArrayList<IEnjoyable> enjoyables;

    public ThemePark(String name) {
        this.name = name;
        this.enjoyables = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void add(IEnjoyable enjoyable) {
        this.enjoyables.add(enjoyable);
    }

    public int themeParkSize() {
        return enjoyables.size();
    }

    public String funRatings() {
        if (themeParkSize() > 0) {
            String funRatings = "";
            for (int i = 0; i < enjoyables.size(); i++) {
                if (i == 0) {
                    funRatings += enjoyables.get(i).getName() + ":" + enjoyables.get(i).getFunRating();
                } else {
                    funRatings += ", " + enjoyables.get(i).getName() + ":" + enjoyables.get(i).getFunRating();
                }
            }
            return funRatings;
        }
        return "No attractions";
    }
}
