<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sign Up</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            display: flex;
            height: 100vh;
        }
        .signup-container {
            display: flex;
            width: 100%;
        }
        .left-panel {
            flex: 1;
            background: linear-gradient(to bottom, #005c97, #363795);
            color: white;
            display: flex;
            flex-direction: column;
            justify-content: center;
            align-items: center;
            padding: 2rem;
        }
        .left-panel .logo {
            font-size: 2rem;
            font-weight: bold;
            margin-bottom: 1rem;
        }
        .signup-form {
            flex: 1;
            display: flex;
            flex-direction: column;
            justify-content: center;
            align-items: center;
            padding: 2rem;
            background: white;
        }
        .signup-form h2 {
            margin-bottom: 1.5rem;
            color: #005c97;
        }
        .signup-form input {
            width: 80%;
            padding: 0.8rem;
            margin-bottom: 1rem;
            border: 1px solid #ccc;
            border-radius: 5px;
            font-size: 1rem;
        }
        .signup-form button {
            width: 80%;
            padding: 0.8rem;
            background: linear-gradient(to right, #005c97, #363795);
            color: white;
            border: none;
            border-radius: 5px;
            font-size: 1rem;
            cursor: pointer;
        }
        .terms {
            display: flex;
            align-items: center;
            width: 80%;
            margin-bottom: 1rem;
        }
    </style>
</head>
<body>
    <div class="signup-container">
        <div class="left-panel">
            <div class="logo">LOGO</div>
            <p>Welcome to our platform! Please fill out the form to sign up.</p>
        </div>
        <div class="signup-form">
            <h2>SIGN UP</h2>
            <form action="/signup" method="post">
                <input type="text" name="fullName" placeholder="FULL NAME" required />
                <input type="text" name="userId" placeholder="USER ID" required />
                <input type="email" name="email" placeholder="EMAIL" required />
                <input type="password" name="password" placeholder="Password" required />
                <input type="password" name="confirmPassword" placeholder="Confirm Password" required />
                <div class="terms">
                    <input type="checkbox" name="terms" required />
                    <label>I have accepted the terms and conditions</label>
                </div>
                <button type="submit">SIGN UP</button>
            </form>
        </div>
    </div>
</body>
</html>
