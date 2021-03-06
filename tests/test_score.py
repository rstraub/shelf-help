from core.score import score


def test_score_high_should_be_worth_three_points():
    assert score.get("High") == 3, "Score 'High' should be worth three points"


def test_score_medium_should_be_worth_two_points():
    assert score.get("Medium") == 2, "Score 'Medium' should be worth two points"


def test_score_low_should_be_worth_one_point():
    assert score.get("Low") == 1, "Score 'Low' should be worth one point"
