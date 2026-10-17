# Expression Checker Kata

This Kata consists in implementing an expression checker that evaluates the validity of delimiters nesting.

---

## 🎯 Step 1: Delimiters Nesting Validation

Given a character string containing brackets `[` `]` and parentheses `(` `)`:
- Check that the **nesting** is valid.
- Every opening delimiter must be closed by the corresponding closing delimiter.

### Examples:

| Expression | Result |
|---|:---:|
| `(aaa(bbbbb[cccccc]))` | ✅ |
| `(a[aa(bbbbbcccccc]))` | ❌ |
| `(aaa[)` | ❌ |
| `cc(aaa[bbbbb]cc[aaa]ccccc)dddd` | ✅ |

---

## 🚀 Step 2: Allowed Symbols Constraint and Delimiters Specification

I want to be able to define the allowed symbols in an expression as well as its delimiters:

- **Allowed symbols**: accepted characters within the expression (e.g., `a`, `b`, `c`).
- **Wrapping symbols**: represented by their opening/closing pair (e.g., `[]`, `()`, `{}`), they must follow the nesting rules from Step 1.

### Examples:

| Allowed symbols | Wrapping symbols | Expression | Result |
|---|---|---|:---:|
| `a`, `b`, `c` | `[]`, `()` | `(aaa(bbbbb[cccccc]))` | ✅ |
| `a`, `b`, `c` | `[]`, `()` | `(aaa(bbbbb[cccccc]d))` | ❌ |
| `a`, `b` | `{}`, `<>` | `{aaa<bbbbb>}` | ✅ |
| `a`, `b` | `{}`, `<>` | `{aaa(bbbbb)}` | ❌ |
