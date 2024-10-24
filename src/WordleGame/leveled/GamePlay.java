package WordleGame.leveled;

// 게임 플레이를 실행하는 추상메서드
// 추상메서드로 게임 레벨별로 분기가 가능하게 설정
abstract class GamePlay extends RandomList {

    protected int tryCount = 0;

    public abstract void gamePlay();

    public abstract void gameResult();
}