
export default function BoardPage(){



    return (
        <div>
            <h1>게시판 페이지</h1>
            <form>
                <input
                    type="text"
                    placeholder="제목"
                    style={{ display: "block", width: "100%", marginBottom: 8 }}
                />

                <textarea
                    placeholder="내용을 입력하세요"
                    rows={10}
                    style={{ display: "block", width: "100%", marginBottom: 8 }}
                />

                <button type="submit">
                    등록
                </button>
            </form>

        </div>
    )
}