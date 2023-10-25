package racinggame

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.ints.shouldBeGreaterThan

class RacingGameTest : BehaviorSpec({

    Given("자동차 게임 시작") {
        When("4이상의 숫자가 나온 경우") {
            val game = RacingGame(
                listOf(
                    Car(),
                    Car()
                )
            ) { 4 }
            game.play()
            Then("모든 자동차가 앞으로 움직여야 한다") {
                game.currentPositions().forEach {
                    it shouldBeGreaterThan 0
                }
            }
        }
    }
})
