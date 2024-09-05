package lesson41;

public class Player implements Comparable<Player> {
    private String name;
    private Integer score;

    public Player(String name, Integer score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Player that) {
        if (this.getScore().equals(that.score)) {
            return -Integer.compare(this.score,that.score);
        }else {
            return this.name.compareTo(that.name);
        }
    }
}
