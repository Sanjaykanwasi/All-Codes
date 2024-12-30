Step 1: Run the following commands

```
npm install -D tailwindcss
npx tailwindcss init
```

Setup 2: Update tailwind.comfig.js file to include this line

```
content: ["*.html"],
```

Step 3: Create src/input.css to include

```
@tailwind base;
@tailwind components;
@tailwind utilities;
```

Step 4: inlcude output.css to index.html

Step 5: Run the command

```
npx tailwindcss -i ./src/input.css -o ./src/output.css --watch
```
