# Impractical Turn-In System (AP CSA Final Project)

A deliberately frustrating, anti-user interface designed as a Google Chrome Extension, backed by an algorithm-heavy object-oriented Java prototype. This project satisfies all AP Computer Science A curriculum requirements including structural encapsulation, linear searches, dynamic mutation via collections, 2D array traversal, and algorithmic sorting.

## 👤 User-Centered Design
* **The User:** A student who finds typical online submission portals too passive, straightforward, and unengaging.
* **The Core Problem:** Standard online turn-in procedures do not verify a student's active cognitive responsiveness, leading to mindless, passive submissions.
* **The Solution:** A multi-layered verification gauntlet built on rigorous algorithmic constraints that forces the user to actively problem-solve and maintain sharp focus before a task can be completed.

---

## 🗺️ The 4-Sprint Architectural Pathway

### 🏁 Sprint 1: The Jumping Button (Logic & Movement)
* **CSA Requirements:** Primitive variables, conditional statements (if/else), coordinate boundaries, and Math.random().
* **Impractical Feature:** The "Turn In" target occupies a 2D coordinate space. Whenever the user's cursor entry comes within a 100-pixel "danger zone," the button uses distance-formula calculation to instantly teleport to a random set of coordinates.

### 🔤 Sprint 2: The Character Scramble (Arrays & Linear Search)
* **CSA Requirements:** 1D array initialization, array traversal loops, character casting, and linear search algorithms.
* **Impractical Feature:** To unlock the next level, the user must look through a randomized 50-character array to select indices that spell out the exact string "IPROMISETHISISNOTLATE". Any incorrect index selection triggers a full state reset and rearranges the entire board.

### ⚠️ Sprint 3: The Pop-up Multiplier (ArrayLists & Interacting Classes)
* **CSA Requirements:** ArrayList dynamic mutation, object collections, backward index iteration, and multiple interacting classes.
* **Impractical Feature:** Approaching the submission target spawns an array of Obstacle objects representing fake error messages. The list grows exponentially unless handled. To clear the queue, the user must close obstacles by inputting their specific IDs; removing items requires a reverse loop to avoid a ConcurrentModificationException.

### 🎛️ Sprint 4: The Final Verification Grid (2D Arrays & Sorting)
* **CSA Requirements:** 2D array matrix traversal (int[][]), nested loops, and the Selection Sort algorithm.
* **Impractical Feature:** The final submission passcode is locked inside a 3x3 scrambled matrix. The user must manually run a nested Selection Sort pass to align the data structure properly while the submission button slowly sinks to the bottom of the window under a simulated gravity constraint.

---

## 🛠️ Porting Architecture (Java to JavaScript)
The foundational logic was engineered using lower-level Java syntax to map cleanly to native JavaScript arrays and collections without relying on heavy external third-party APIs.

* **Variables:** int x = 10; translates directly to let x = 10;
* **Dynamic Collections:** ArrayList<Obstacle> converts seamlessly to standard JavaScript arrays [] utilizing .filter() or .push() operations.
* **Iterators:** Traditional standard index loops match identically across both languages.

---

## 📤 Project Deployment Instructions
1. Host all four Java development sprint directories (/Sprint1_Java through /Sprint4_Java) containing separate App.java components in your repository root.
2. Store production configuration files (manifest.json, content.js, and styles.css) within the /Final_Extension folder.
3. Open Chrome, navigate to chrome://extensions/, enable Developer Mode, and choose Load unpacked pointing to your extension build directory.
