import { useState } from "react";
import { useNavigate } from "react-router-dom";

export default function LoginPage(){
    const [email, setEmail] = useState("");
    const [password, setPassword] = useState("");
    const navigate = useNavigate();

    const goToSignup = () => {
        navigate("/signup");
    }

    const goToLogin = () => {
        navigate("/board");
    }

    return (
        <div>
            <h1>로그인페이지</h1>

            <form>        
                <input
                    type="email"
                    placeholder="이메일"
                    value={email}
                    onChange={(e) => setEmail(e.target.value)}
                />
                <input 
                    type="password"
                    placeholder="비밀번호"
                    value={password}
                    onChange={(e) => setPassword(e.target.value)}
                />
                <button type="submit" onClick={goToLogin}>로그인</button>
            </form>
            
            <button onClick={goToSignup}>회원가입</button>
      
        </div>
    );
}