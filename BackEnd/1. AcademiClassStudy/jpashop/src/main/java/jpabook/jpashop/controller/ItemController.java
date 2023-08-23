package jpabook.jpashop.controller;

import jpabook.jpashop.domain.item.Book;
import jpabook.jpashop.domain.item.Item;
import jpabook.jpashop.service.ItemService;
import jpabook.jpashop.web.BookForm;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class ItemController {

    private final ItemService itemService;

    @GetMapping (value = "/items/new")
    public String createForm(Model model){
        model.addAttribute("form", new BookForm());
        return "items/createItemForm";
    }

    @PostMapping (value = "/items/new")
    public String create(BookForm form){

        Book book = new Book ();
        book.setName(form.getName());
        book.setPrice(form.getPrice());
        book.setStockQuantity(form.getStockQuantity());
        book.setAuthor(form.getAuthor());
        book.setIsbn(form.getIsbn());

        itemService.saveItem(book);
        return "redirect:/items";
    }

    @GetMapping(value = "/items")
    public String list(Model model){
        List<Item> items = itemService.findItems();
        model.addAttribute("items", items);
        return "items/itemList";
    }

    @GetMapping(value = "/items/{itemId}/edit")
    public String updateItemForm(@PathVariable("itemId") Long itemId, Model model){
        Book item = (Book) itemService.findOne(itemId);  // 다운캐스팅법
        BookForm form = new BookForm();

        form.setId(item.getId());
        form.setName(item.getName());
        form.setPrice(item.getPrice());
        form.setStockQuantity(item.getStockQuantity());
        form.setAuthor(item.getAuthor());
        form.setIsbn(item.getIsbn());

        model.addAttribute("form", form);
        // 화면에 보이기 위해선 model.addAttribute("form", form); 이 필요하다
        return "items/updateItemForm";
    }

    // 1. itemService 는 아이템과 관련된 비즈니스직을 처리하는 클래스
    // findOne(itemId) 메소드 호출해서 itemId 해당하는 아이템을 조회
    // ★ 조회된 아이템을 Book 타입으로 맞게 캐스팅

    // 2. 수정 폼에 렌더링 할 'BookForm' 객체를 생성합니다.
    // BookForm 은 아이템 정보를 표시하고 수정하기 위한 dto
    // DTO ( data Transfer Object) 데이터 전송 객체 라고 합니다.

    /*@PostMapping(value = "/items/{itemId}/edit")
    public String updateItem(@ModelAttribute("form") BookForm form) {
        Book book = new Book();
        book.setId(form.getId());
        book.setName(form.getName());
        book.setPrice(form.getPrice());
        book.setStockQuantity(form.getStockQuantity());
        book.setAuthor(form.getAuthor());
        book.setIsbn(form.getIsbn());
        itemService.saveItem(book);
        return "redirect:/items";

    }*/
    /*@PostMapping(value = "/items/{itemId}/edit")
    public String updateItem(@PathVariable("itemId") Long itemId, BookForm form) {
        // 1. itemId로 기존 아이템 조회
        Item item = itemService.findOne(itemId);

        // 2. 변경된 정보를 기존 아이템에 업데이트
        item.setName(form.getName());
        item.setPrice(form.getPrice());
        item.setStockQuantity(form.getStockQuantity());

        // Book 타입인 경우에만 해당하는 추가 정보를 업데이트
        if (item instanceof Book) {
            Book book = (Book) item;
            book.setAuthor(form.getAuthor());
            book.setIsbn(form.getIsbn());
        }

        // 3. 아이템 저장 (변경 내용 반영)
        itemService.saveItem(item);

        return "redirect:/items";
    }*/
    @PostMapping(value = "/items/{itemId}/edit")
    public String updateItem(@PathVariable Long itemId, @ModelAttribute("form") BookForm form) {
        itemService.updateItem(itemId, form.getName(),form.getPrice(),
        form.getStockQuantity());

        return "redirect:/items";
    }

}