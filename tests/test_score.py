from core.score import score


def test_score_high_should_be_three():
    assert score.get("High") == 3, "Score 'High' should be worth three points"
