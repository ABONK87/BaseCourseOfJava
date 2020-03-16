package baseCourseOfJava.lection10.HomeWork1;

import java.util.List;
import java.util.ListIterator;
import java.util.Objects;

public class Track {
    private int length;

    private int finishing = 0;

    public void print(List<Car> cars) {
        for (int i = 0; i < cars.size() - 1; i++) {
            for (int j = i + 1; j <= cars.size() - 1; j++) {
                if (cars.get(i).getCurrentPosition() > cars.get(j).getCurrentPosition()) {
                    System.out.printf("%d машина обоганала %d машину\n", cars.get(i).getId(), cars.get(j).getId());
                }
            }
        }
    }


    public void finishing (List<Car> cars) {
        ListIterator<Car> itr = cars.listIterator();
        while (itr.hasNext()){
            itr.next();
        }
        while (itr.hasPrevious()){
            Car car = itr.previous();
            if (car.getCurrentPosition() >= length) {
                System.out.printf("%d машина финишировала\n", car.getId());
                itr.remove();
                finishing++;
            }
        }
    }




    public Track(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Track{" +
                "length=" + length +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Track track = (Track) o;
        return length == track.length;
    }

    @Override
    public int hashCode() {
        return Objects.hash(length);
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getFinishing() {
        return finishing;
    }

    public void setFinishing(int finishing) {
        this.finishing = finishing;
    }
}
