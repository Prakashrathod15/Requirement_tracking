<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>HR Dashboard</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f4f4f4;
        }

        header {
            background-color: #333;
            color: #fff;
            padding: 10px;
            text-align: center;
        }

        nav {
            background-color: #555;
            color: #fff;
            padding: 10px;
            text-align: center;
        }

        section {
            padding: 20px;
        }

        .card {
            background-color: #fff;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            padding: 20px;
            margin: 20px;
            border-radius: 5px;
        }

        .flex-container {
            display: flex;
            justify-content: space-around;
            flex-wrap: wrap;
        }

        .card h2 {
            color: #333;
        }

        footer {
            background-color: #333;
            color: #fff;
            padding: 10px;
            text-align: center;
            position: fixed;
            bottom: 0;
            width: 100%;
        }
    </style>
</head>
<body>
    <header>
        <h1>HR Dashboard</h1>
    </header>

    <nav>
        <a href="#">Home</a>
        <a href="#">Employees</a>
        <a href="#">Reports</a>
        <a href="#">Settings</a>
    </nav>

    <section>
        <div class="flex-container">
            <div class="card">
                <h2>Total Employees</h2>
                <p>300</p>
            </div>

            <div class="card">
                <h2>Active Employees</h2>
                <p>250</p>
            </div>

            <div class="card">
                <h2>Departments</h2>
                <p>Finance, IT, HR, Marketing</p>
            </div>
        </div>
    </section>

    <footer>
        &copy; 2023 HR Dashboard
    </footer>
</body>
</html>
