# 🚫 No `static` Keyword in Go

Go doesn't have the `static` keyword at all.

But the same behavior is achieved by using:

1. **Package-level variables**
2. **Package-level functions**

These live outside any struct and are shared globally.

```go
package utils

var GameVersion = "v1.2.0"

func CalculateDamage(power, multiplier int) int {
	return power * multiplier
}
```
and then in `main.go`:

```go
fmt.Println(utils.GameVersion)
fmt.Println(utils.CalculateDamage(10, 3))
```

✅ No need to instantiate anything. Just import and use.

🧠 So yeah, Go doesn't use `static` but encourages functional design with package-level stuff.