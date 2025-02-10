# JavaDoc

## Introduction

Ce dépôt a un **objectif éducatif** et illustre **l'automatisation du déploiement (CD - Continuous Deployment)** d'une documentation **JavaDoc** à chaqye mise à jour du code:
1. **Génération automatique de la documentation JavaDoc** à chaque `push` sur `main`.
2. **Déploiement automatique de la documentation sur GitHub Pages** via `gh-pages`.

## Architecture

### Branche `main`

La branche `main` est la **branche de production**, contenant le code source du projet.

**Structure principale**:

- `.github/workflows` -> **GitHub Actions** pour l'automatisation.
- `bin/` -> Contient l'exécutable de Java.
- `src/` -> contient les **packages du code java**.

### Gh-pages

la branche `gh-pages` est dédiée à l'**hébergement** de la documentation JavaDoc générée à partir du code de `main`.
1. Mise à jour automatique à chaque **push** sur `main`.
2. Accessible en ligne via **GitHub Pages**.

## Guide d'installation et d'utilisation

### Prérequis

Assurez-vous d'avoir installé:
- **Java** (JDK 8 ou supérieur)
- **Git**
- **Un éditeur de code** (VS Code, IntelliJ, Eclipse, etc...)

### Cloner le projet

```bash
git clone https://github.com/EnzoCordovana/JavaDoc.git
cd JavaDoc
```

### Générer la documentation JavaDoc Manuellement

Si vous voulez générer la documentation localement:

```bash
javadoc -d docs -sourcepath src -subpackages com.monprojet
```
Cela créera la documentation dans le dossier `docs/`.

### Configurer GitHub Pages

1. Aller dans **Settings -> Pages**
2. Sélectionner la branche `gh-pages`
3. Sauvegarder

### Déploiement automatique avec GitHub Actions
Pas besoin d'action manuelle! La documentation est **Automatiquement générée et publiée** après chaque push sur `main` grâce à **GitHub Actions**

## Consulter la documentation

**Lien de la JavaDoc hébergée**: [Clique ici](https://enzocordovana.github.io/JavaDoc)

## Licence

Ce projet est sous licence **MIT**
Vous êtes libre de l'utiliser, de le modifier et de le partager tant que vous incluez la licence originale.

Voir le fichier [LICENSE](LICENSE) pour plus de détails.

---

**Bonus**: Ce projet peut être utlisé comme **template** pour générer et héberger automatiquement une JavaDoc dans n'importe quel projet Java!