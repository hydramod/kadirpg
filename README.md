# hello-infra

## Quick start (step-by-step)

### Option A: Run locally with Maven
1. **Install Java 17 and Maven** (if not already installed).
2. **From the repo root, start the app:**

   ```bash
   mvn spring-boot:run
   ```

3. **Verify the backend JSON:**

   ```bash
   curl http://localhost:8080/
   ```

4. **Open the frontend (bonus):**

   ```text
   http://localhost:8080/index.html
   ```

### Option B: Run with Docker
1. **Build the image:**

   ```bash
   docker build -t hello-infra .
   ```

2. **Run the container:**

   ```bash
   docker run --rm -p 8080:8080 hello-infra
   ```

3. **Verify the backend JSON:**

   ```bash
   curl http://localhost:8080/
   ```

4. **Open the frontend (bonus):**

   ```text
   http://localhost:8080/index.html
   ```
