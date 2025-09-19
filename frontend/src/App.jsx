import { useState } from 'react'
import { BrowserRouter, Routes, Route } from 'react-router-dom'
import LoginPage from "./pages/LoginPage";
import SignupPage from "./pages/SignupPage";
import BoardPage from "./pages/BoardPage";

export default function App() {
  const [count, setCount] = useState(0)

  return (
    <BrowserRouter>
      <Routes>
        <Route path="/login" element={<LoginPage />} /> 
        <Route path="/signup" element={<SignupPage />} />
        <Route path="/board" element={<BoardPage />} />
      </Routes>
    </BrowserRouter>
  );
}

