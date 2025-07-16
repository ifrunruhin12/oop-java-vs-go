# ⚠️ Constructor Overriding in Go?

Go doesn’t have constructors in the traditional sense.

Instead, you create **constructor-like functions**:

```go
func NewCharacter(name string) Character {
    return Character{Name: name}
}
```
And you can’t override these, they’re just regular functions.

If you embed a struct inside another (composition), you manually call the base constructor-like function if needed.

Go also doesn’t support function overloading, so even constructor variants need different names.