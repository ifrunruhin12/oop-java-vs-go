package main

import "fmt"

type Player struct {
	name   string
	health int
}

func NewPlayer(name string) Player {
	return Player{name: name, health: 100}
}

func (p *Player) Name() string {
	return p.name
}

func (p *Player) Health() int {
	return p.health
}

func (p *Player) TakeDamage(damage int) {
	if damage < 0 {
		return
	}
	p.health -= damage
	if p.health < 0 {
		p.health = 0
	}
}

func main() {
	player := NewPlayer("Ezio")
	fmt.Printf("%s has %d health.\n", player.Name(), player.Health())
	player.TakeDamage(30)
	fmt.Printf("After damage: %d health.\n", player.Health())
	// player.health = -100 // ❌ not possible from outside package
}