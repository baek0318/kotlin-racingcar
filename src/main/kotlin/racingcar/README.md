## 기능 요구 사항

---

### 초간단 자동차 경주 게임을 구현한다.

- 주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다.
- 사용자는 몇 대의 자동차로 몇 번의 이동을 할 것인지를 입력할 수 있어야 한다.
- 전진하는 조건은 0에서 9 사이에서 무작위 값을 구한 후 무작위 값이 4 이상일 경우이다.
- 자동차의 상태를 화면에 출력한다. 어느 시점에 출력할 것인지에 대한 제약은 없다.

#### 추가 요구 사항
- 각 자동차에 이름을 부여할 수 있다. 자동차 이름은 5자를 초과할 수 없다. 
- 전진하는 자동차를 출력할 때 자동차 이름을 같이 출력한다.
- 자동차 이름은 쉼표(,)를 기준으로 구분한다.
- 자동차 경주 게임을 완료한 후 누가 우승했는지를 알려준다. 우승자는 한 명 이상일 수 있다.

---

### 기능 목록

- [x] 입력
    - [x] 자동차 대수를 입력받음
        - [x] 0대 입력 시 예외 발생
    - [x] 시도할 횟수를 입력 받음
        - [x] 0회 입력 시 예외 발생
    - [x] 각 자동차에 이름을 입력 (쉽표로 구분)
        - [x] 자동차 이름은 5자 이하
        - [x] 자동차 이름은 null 혹은 빈 값일 수 없음
- [x] 출력
    - [x] 질문 출력
    - [x] 레이싱 경과 출력
    - [x] 경과에 이름 표시
    - [x] 우승자 표시
- [x] 레이스
    - [x] 전진(0~9무작위값 -> 4이상의 경우 전진)