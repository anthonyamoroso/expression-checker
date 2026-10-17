# Expression Checker Kata

Ce Kata consiste à implémenter un vérificateur d'expressions évaluant la validité de l'imbrication des délimiteurs.

---

## 🎯 Étape 1 : Validation de l'imbrication des délimiteurs

Étant donnée une chaîne de caractères contenant des crochets `[` `]` et des parenthèses `(` `)` :
- Vérifier que l'**imbrication** (nesting) est valide.
- Chaque délimiteur ouvrant doit obligatoirement être fermé par le délimiteur fermant correspondant.

### Exemples :

| Expression | Résultat |
|---|:---:|
| `(aaa(bbbbb[cccccc]))` | **Valide** |
| `(a[aa(bbbbbcccccc]))` | **Invalide** |
| `(aaa[)` | **Invalide** |
| `cc(aaa[bbbbb]cc[aaa]ccccc)dddd` | **Valide** |

---

## 🚀 Étape 2 : Contrainte sur les symboles autorisés

Ajouter une contrainte sur les symboles utilisables en les passant en paramètres :
- **1ᵉʳ paramètre** : la liste des symboles autorisés (`List<String>`).
  - **1 seul caractère** : symbole simple (non-wrapping), ex: `"a"`, `"b"`, `"c"`.
  - **2 caractères** : symbole englobant ouvrant/fermant (wrapping symbol), ex: `"[]"`, `"()"`.
- **2ᵉ paramètre** : la séquence / expression à valider (`String`).
