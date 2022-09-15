package pest;

public class HouseFly extends Insect implements IPest {
    public void FlyAroundYourHead() {
    }
    public void LandOnThings() {
    }

    @Override
    public void annoy() {
        for(int i = 0; i <10000 ; i++){
            FlyAroundYourHead();
            LandOnThings();
        }
    }
}
