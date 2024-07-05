import logo from './logo.svg';
import './App.css';
import { useState } from 'react';

//App() 함수의 리턴문 안에 작성하는 코드가 화면에 나타남.
//html 코드처럼 보이는 것은 실은 jsx 라는 문법이다.
//그렇기 때문에 html과 조금 다른 부분이 있다.
function App() {
  console.log(1);
  //const titles = ['울산 맛집', 'React공부', '집에가고싶다'];
  //제목 정보를 저장하고 있는 변수
  const [titles, setTitles] = useState(['울산 맛집', 'React공부', '집에가고싶다']);

  //좋아요 갯수
  //대괄호의 첫번째 : 변수
  //두번째 : 변수의 값을 변경시켜주는 함수
  //ex> setLikeCnt(5); -> likeCnt 변수의 값을 5로 변경
  //useState로 만들어진 변수는 값을 변경하면 html화면을 재랜더링한다.
  let [likeCnt, setLikeCnt] = useState(0);



  function test(){
    alert(1);
  }

  return (
    <div className="App">
      <div className="blog-nav">
        <h3>My Blog</h3>
      </div>

      <button type='button' onClick={() => {
       const copyTitles = [...titles];
       copyTitles[0] = '대구 맛집';
       setTitles(copyTitles);
      }}>
        제목변경
      </button>

      <div className="list">
        <h4>
          {titles[0]}
          <span onClick={() => {
            setLikeCnt(likeCnt + 1);
            
          }}>👍</span>
          {likeCnt}
        </h4>
        <p>2024-07-04 작성</p>
      </div>
      <div className="list">
        <h4>{titles[1]}</h4>
        <p>2024-07-04 작성</p>
      </div>
      <div className="list">
        <h4>{titles[2]}</h4>
        <p>2024-07-04 작성</p>
      </div>
    </div>
  );
}



export default App;
