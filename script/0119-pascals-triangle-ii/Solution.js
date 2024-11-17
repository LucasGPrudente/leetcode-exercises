// Return the rowIndex-th row of the Pascal's triangle

/**
 * @param {number} rowIndex
 * @return {number[]}
 */

var getRow = function (rowIndex) {
    let lastRow = [1];

    for (let i = 1; i <= rowIndex; i++) {
        let currRow = [1];

        for (let j = 1; j < lastRow.length; j++) {
            currRow.push(lastRow[j] + lastRow[j - 1]);
        }

        currRow.push(1);

        lastRow = currRow;
    }

    return lastRow;
};