/*
 * Copyright (C) 2009-2013 Slava Semushin <slava.semushin@gmail.com>
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301, USA.
 */
package ru.mystamps.web.tests.it.page;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import ru.mystamps.web.Url;

@DefaultUrl(Url.SITE + Url.ACTIVATE_ACCOUNT_PAGE)
public class ActivateAccountPage extends PageObject {
	
	// TODO: why its in package scope?
	// TODO: use id instead of class?
	@FindBy(className = "alert-success")
	WebElement successfulMessage;
	
	public ActivateAccountPage(WebDriver driver) {
		super(driver);
	}
	
	public String getSuccessfulMessageText() {
		return successfulMessage.getText();
	}
	
}
