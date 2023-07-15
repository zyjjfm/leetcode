import java.security.Principal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Solution1603 {

    int big,medium,small;

    // 设计停车系统
    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }
    public boolean addCar(int carType) {
        if(carType == 1){
            if(big > 0){
                big--;
                return true;
            }
        }else if(carType == 2){
            if(medium > 0){
                medium--;
                return true;
            }

        }else if(carType == 3){
            if(small > 0){
                small--;
                return true;
            }
        }
        return false;
    }
    }