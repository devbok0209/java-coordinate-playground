## [NEXTSTEP 플레이그라운드의 미션 진행 과정](https://github.com/next-step/nextstep-docs/blob/master/playground/README.md)

---
## 학습 효과를 높이기 위해 추천하는 미션 진행 방법

---
1. 피드백 강의 전까지 미션 진행 
> 피드백 강의 전까지 혼자 힘으로 미션 진행. 미션을 진행하면서 하나의 작업이 끝날 때 마다 add, commit
> 예를 들어 다음 숫자 야구 게임의 경우 0, 1, 2단계까지 구현을 완료한 후 push

![mission baseball](https://raw.githubusercontent.com/next-step/nextstep-docs/master/playground/images/mission_baseball.png)

---
2. 피드백 앞 단계까지 미션 구현을 완료한 후 피드백 강의를 학습한다.

---
3. Git 브랜치를 master 또는 main으로 변경한 후 피드백을 반영하기 위한 새로운 브랜치를 생성한 후 처음부터 다시 미션 구현을 도전한다.

```
git branch -a // 모든 로컬 브랜치 확인
git checkout master // 기본 브랜치가 master인 경우
git checkout main // 기본 브랜치가 main인 경우

git checkout -b 브랜치이름
ex) git checkout -b apply-feedback
```

### 연료 주입
* 인터페이스, 추상 클래스의 차이가 있을까?
* 이동거리 입력 받는 기능
* 차량별 필요한 연료량 가지는 기능
* 연료량 확인하는 보고서


### 좌표 계산기 (선)

~~* :: 쉼표로 x, y 값 구분 테스트 Coordinate~~
~~* X, Y좌표 모두 최대 24여야하는 테스트~~
~~* 24사 초과시 에러 발생하는 테스트~~ 
~~* 좌표값 두개는 "-" 구분 하는 테스트~~
*** 거리 계산하는 테스트**
* // 제곱근((A.x - B.x)^제곱 + (A.y - B.y)^제곱)

### 좌표 계산기 (사각형)
* 좌표값을 네 개 입력한 경우, 네 점을 연결하는 사각형으로 가정한다.
* 사다리꼴이면 예외
-> 1,2,3,4 일때
-> 1번 4번의 x값 불일치 2번 3번의 x값 불일치
* 마름모이면 예외
-> 1,2,3,4
-> 1번 과 3번의 y값 일치, 2번과 4번의 x값 일치
* 직사각형이면 예외 발생 안함
-> 1번과 2번 y값 일치, 3번과 4번 y값 일치
* 사각형 넓이 계산 테스트

1,4 거리
1,2 거리


### 좌표 계산기 (삼각형)
* ~~좌표 값 세개 를 입력 받아 삼각형을 만드는 테스트~~
* 삼각형의 넓이를 구하는 테스트 



### TODO LIST 피드백 반영 리팩토링 하기
* @BeforeEach
* @AfterEach
* setup, tearDown
* Line(클래스) <- AbstractFigure(추상 클래스) <- Figure(인터페이스)
* Function 사용하기