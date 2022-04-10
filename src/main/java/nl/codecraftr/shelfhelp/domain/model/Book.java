package nl.codecraftr.shelfhelp.domain.model;

/**
 * Book metadata with estimated effort and payoff.
 */
public record Book(String title, Effort effort, Payoff payoff) {
}
