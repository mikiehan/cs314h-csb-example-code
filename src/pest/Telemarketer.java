package pest;

public class Telemarketer extends Person implements IPest{
    void CallDuringDinner() {
    }
    void ContinueTalkingWhenYouSayNo() {
    }

    @Override
    public void annoy() {
        CallDuringDinner();
        ContinueTalkingWhenYouSayNo();
    }
}
