---
layout: default.md
title: "Li Ren Wong's Project Portfolio Page"
---

## Project: MALAddress (based on AddressBook Level 3)

MALAddress is a desktop address book application adapted from AddressBook Level 3 (AB3). It targets hawker stall owners and staff, helping them manage supplier and regular-customer contacts efficiently. The app is written in Java, uses a CLI for interaction, and has a JavaFX GUI.

Given below are my contributions to the project.

### New Features
* **New Feature**: Supplier/customer tagging + remarks (`tag` command)
  * What it does: Allows users to label contacts as `supplier` or `customer` (and other tags like `regular`) and attach short remarks for quick reference.
  * Why it matters: Helps hawker staff separate suppliers vs customers and store operational notes (e.g., supply type, preferences).
  * PR(s): [#??](LINK)

* **New Feature**: List currently available suppliers (`open` / `available` command)
  * What it does: Filters the contact list to show suppliers who are “open now” based on stored operating hours.
  * Why it matters: Saves time during peak hours when staff need to contact reachable suppliers quickly.
  * PR(s): [#??](LINK)

* **New Feature**: Help command (`help COMMAND`)
  * What it does: Shows correct command formats/examples without opening an external guide.
  * Why it matters: Speeds up onboarding and reduces command-format mistakes.
  * PR(s): [#??](LINK)

### Enhancements to Existing Features
* Improved existing commands (e.g., `add/edit/find`) to support tags/remarks and validation rules.  
  * PR(s): [#??](LINK), [#??](LINK)

### DevOps / Project Infrastructure
* Set up / improved CI workflows, repository hygiene, and team workflow practices (issues → PRs → reviews → merges).
  * PR(s): [#??](LINK)
  * Notes: (e.g., GitHub Actions checks, branch protections, conventions)

### Documentation
* **User Guide**
  * Added/updated documentation for: `tag`, `open/available`, `help`, and updated command formats.
  * PR(s): [#??](LINK)

* **Developer Guide**
  * Added implementation/architecture notes for new commands and data model changes (tags/remarks/hours).
  * PR(s): [#??](LINK)

### Testing
* Added/updated tests for new features and validation rules.
  * PR(s): [#??](LINK)

### Code Contributed
* RepoSense report: [RepoSense link](LINK)

### Team Contributions / Collaboration
* PR reviews with non-trivial comments: [#??](LINK), [#??](LINK)
* Issues created/managed: (link to milestone/issue list)

---
_You can add/remove categories as needed._
