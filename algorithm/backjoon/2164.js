const card = n => {
  if (typeof n === "number" && n > 0 && n <= 500000) {
    let arr = [];
    for (let i = 1; i <= n; i++) {
      arr.push(i);
    }

    while (arr.length !== 1) {
      console.log(arr.length);
      // 1. 0번째 요소를 삭제한다.
      arr.shift();
      // 2. 1번째 요소를 마지막에 추가한다.
      arr.push(arr[0]);
      // 3. 첫번째 요소를 삭제한다.
      arr.shift();
      console.log(arr.length);
      if(arr.length === 1){
        console.log(arr);
      }
    }
  }
};

card(4);
