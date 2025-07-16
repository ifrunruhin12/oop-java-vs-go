# ⚠️ No "Protected" in Go

Go only has two visibility levels:
- **Exported (public)**: Capitalized identifiers
- **Unexported (private)**: lowercase identifiers

So Go doesn't support:
- Protected access (visible to child types)
- Package-private control across hierarchy

### ✅ What Go Encourages Instead:

Use **package scoping** and **composition** to control visibility:

```go
type character struct {
	stamina int
	secretCode int
}

// composition over inheritance
type warrior struct {
	character
}
```

Go's philosophy: if you want encapsulation and safe reuse, share via packages and interfaces, not by inheritance and protected access.