--Searching--
    1. I used part of a deck of cards, and I noticed that after sorting the cards into an ascending order, the binary search algorithm was much, much faster, because I could essentially knock out over half of the cards that I would otherwise have to count.
    2. An algorithm is efficient if it can complete the same task in a shorter time than another algorithm. I think the binary search is more efficient because it only has to work through about half of the cards, total, as opposed to all of the cards. 
    3. i. Under the search algorithm:
        1. Start at apple. Check if it is a blueberry. It is not, so move on
        2. Check each individual item in the list to see if it's a blueberry. If it is not, go to the next one. If it is, stop there. If it is not, move on to the next item.
        3. If you have reached the end of the list, return -1.
          Under the binary search algorithm:
        1. Start at the middle of the list. In this case, it is lime. Check if it is a blueberry. It is not, and since the list is alphabetical, it and every fruit after it cannot be a blueberry.
        2. Go to the middle of the items in the list that can still be bluebery (Between apple and lime, but not including lime.) Now, banana is the middle. Banana is not a blueberry, nor is anything that comes before banana. 
        3. Check the middle between banana and lemon. It is cherry, which comes after blueberry, so cherry and everything after it cannot be the blueberry.
        4. Go to the middle of the remaining items, of which only banana remains. Since the list cannot be divided any further, blueberry is not in the list. 
      ii. Search accessed 11 items. Binary search technically only accessed 4.
      iii.  Search would access 1000 items, binary search would access 10.
    
    