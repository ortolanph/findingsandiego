package pho.findingsandiego.core.beans;

public class Burglar {
    public String name;
    public Gender gender;
    public Hair hair;
    public Eye eye;
    public String occupation;
    public String favoriteFood;

    @Override
    public String toString() {
        return new StringBuffer("Burglar{")
                .append("name='").append(name).append('\'')
                .append(", gender=").append(gender)
                .append(", hair=").append(hair)
                .append(", eye=").append(eye)
                .append(", occupation='").append(occupation).append('\'')
                .append(", favoriteFood='").append(favoriteFood).append('\'')
                .append('}')
                .toString();
    }
}
