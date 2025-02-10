# JavaDoc

## Introduction

Répository à but éducatif, qui montre un petit projet de comment automatiser certain truc...
Notament la génération de la documentation de son code java à chaque push sur la branch main et la documentation qui se fait héberger sur une page en ligne

## Architecture

### Main

La branche `main` est la branche de production, elle détient le code du projet à délivrer au client.

- `.github/workflows` -> git action
- `bin/` -> l'executable de java
- `src/` -> contient les packages de notre code java

### Gh-pages

la branche `gh-pages` est la branche d'hébergement de la doc du code du projet qui provient de la branche `main`.