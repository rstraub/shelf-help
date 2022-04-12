# 📚 Shelf-help

Optimizing your unread bookshelf.

## Why

I wrote this tool, because like many others, I buy more books than I can read. Every time I
completed a book a challenge occurred: what book to read next? You could pick the first book that
draws your attention, but I wanted to go at it a bit smarter. That's where this tool comes in.

Shelf-help uses estimations you have about books, and will give you the optimal order to devour your
bookshelf in.

## How It Works

Shelf-help needs two estimates for each book on your shelf: _effort_ and _payoff_.

* **Effort** is how much work you think it will take to complete the book.
* **Payoff** is how much you think the book will help you at this point in your career.

Both estimates are classified like this:

- Very Low
- Low
- Medium
- High
- Very High

Using these estimates Shelf-help calculates a score per book, and uses that to sort them from most
to least valuable. Most valuable being a book with *Very Low* effort and *Very High* payoff, and
least valuable a book with *Very High* effort and *Very Low* payoff.
