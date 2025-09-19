import { useNavigate } from "react-router-dom"

export default function SignupPage(){
    const navigate = useNavigate();
    
    const goToLogin = () => {
        navigate("/login");
    }

    return(
        <div>
            <h1>회원가입페이지</h1>
            <form>
                <input
                    type="text"
                    placeholder="이름"
                />
                <input
                    type="email"
                    placeholder="이메일"
                />
                <input
                    type="password"
                    placeholder="비밀번호 입력"
                />
                <input
                    type="password"
                    placeholder="비밀번호 확인"
                />
                <input
                    type="text"
                    placeholder="휴대폰 (010-1234-5678)"
                />
                <input
                    type="text"
                    placeholder="주민등록번호 (######-#######)"
                />

                <div style={{ marginBottom: 8 }}>
                    <label>성별</label><br/>
                    <label><input type="radio" name="gender" value="M" /> 남</label>{" "}
                    <label><input type="radio" name="gender" value="F" /> 여</label>
                </div>

                <div style={{ marginBottom: 8 }}>
                    <label>취미</label><br/>
                    <label><input type="checkbox" name="hobby" value="music" /> 음악</label>{" "}
                    <label><input type="checkbox" name="hobby" value="sports" /> 운동</label>{" "}
                    <label><input type="checkbox" name="hobby" value="reading" /> 독서</label>
                </div>

                <div style={{ marginBottom: 8 }}>
                    <label>직업</label><br/>
                    <select name="job">
                    <option value="">선택하세요</option>
                    <option value="DEV">개발자</option>
                    <option value="PM">프로덕트 매니저</option>
                    <option value="DS">데이터 사이언티스트</option>
                    <option value="DES">디자이너</option>
                    </select>
                </div>

                <button type="submit" onClick={goToLogin}>
                    회원가입
                </button>
                </form>


        </div>
    )
}